pipeline {
    agent any
    environment {
        PATH = "/opt/maven/bin:$PATH"
    }
    stages {
        stage('git clone') {
            steps {
                git 'https://github.com/anil7017/jenkinsDemo.git'
            }
        }
        stage('compile stage') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }
        stage('build') {
            steps {
                echo "hiii  mam"
            }
        }
        stage('deploy') {
            steps {
                sshagent(['jenkins_demo']) {
                   sh "scp -o StrictHostKeyChecking=no /var/lib/jenkins/workspace/jenkinsDemo/target/jenkinsDemo.war ec2-user@15.188.59.200:/opt/tomcat/webapps"
                }
            }
        }
    }
}