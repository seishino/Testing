pipeline {
    agent any
    tools{
        maven 'Maven 3'
    }
    stages{
        stage('test-parallel') {
            steps{
                    sh 'mvn install'
            }
        }
    }
}