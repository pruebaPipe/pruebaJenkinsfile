pipeline {

    agent any

    stages {

        stage ('Compile') {
            steps {
                withMaven(maven: 'maven_actual') {
                    sh ' mvn compile'
                }
            }
        }
        
        stage ('Test') {
            steps {
                withMaven(maven: 'maven_actual') {
                    sh 'mvn test'
                }
            }
        }

        stage ('Deploy') {
            steps {
				withMaven(maven: 'maven_actual'){
                    sh 'mvn deploy'
                    
                }
            }

        }
	
    }

}
