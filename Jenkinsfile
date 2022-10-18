pipeline {
    agent any
    stages {
        stage('test-parallel') {
		parallel{
			steps {
                		sh 'mvn install'
            		}
		}
            
        }
    }
}