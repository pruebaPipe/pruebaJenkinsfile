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
	stage('Sonar analysis') {
        	environment {
        	scannerhome = tool 'Sonar-Scanner'
        }
            steps{
		//sh "scp -r ${'/home/andres/Documentos/sonar-runner-2.4/bin/sonar-project.properties'} ${'/home/andres/Documentos/Jenkins/jenkins/workspace/nodeInstall/'}" 
		withSonarQubeEnv('SonarQubeServer') {
		sh "${scannerHome}/bin/sonar-scanner"

          }
          
      }
    }    
	
    }

}
