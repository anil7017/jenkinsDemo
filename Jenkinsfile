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
                echo "hiii"
            }
        }
    }
}