pipeline {

    agent any

    stages {

        stage ('Build') {
            steps {
                withMaven(maven: 'maven_actual') {
                    sh 'mvn build'
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