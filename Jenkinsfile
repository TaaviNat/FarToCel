pipeline {
    agent any
    environment {
        PATH = "${tool 'Maven 3'}/bin:${env.PATH}"
        GIT_CREDENTIALS = credentials('121ec203-0f3f-4921-b7e2-4b9420ecc132')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', 
                    credentialsId: '121ec203-0f3f-4921-b7e2-4b9420ecc132', 
                    url: 'https://github.com/TaaviNat/FarToCel.git'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
