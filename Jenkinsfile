pipeline {

    agent any

    stages {

        stage ('Compile') {
            steps {
                withMaven(maven: 'maven_actual') {
                    sh ' mvn sonar:sonar'
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
	    
	stage('Sonar analysis') {
        
        environment {
        scannerhome = tool 'sonar mvn'
        }
        steps{
        withSonarQubeEnv('SonarQubeServer') {
          sh "${scannerHome}/bin/sonar-scanner"
              
          }
          
      }
    }    
	
    }

}
