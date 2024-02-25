pipeline {
    agent any
    environment {
        PATH = "${tool 'Maven 3'}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', 
                    credentialsId: '121ec203-0f3f-4921-b7e2-4b9420ecc132', 
                    url: 'https://github.com/TaaviNat/FarToCel.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        success {
            junit '**/target/surefire-reports/TEST-*.xml'
             jacoco(execPattern: '**/target/jacoco.exec')
        }
    }
}
