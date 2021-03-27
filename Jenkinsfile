pipeline {
    agent any
    stages {
        stage('clone git ') {
                steps {
                       git 'https://github.com/anil7017/jenkinsDemo.git'
                }
        }
        stage('compile stage') {
            steps {
                    sh 'mvn clean compile'
            }
        }
        stage('test') {
            steps {
                    sh 'mvn test'
            }
        }
        stage('deploy') {
            steps {
                    sh 'mvn deploy'
            }
        }
    }
}