pipeline {
  agent any
  environment {
    PATH = "${tool 'Maven 3'}/bin:${env.PATH}"
    GIT_CREDENTIALS = credentials("TaaviNat")
  }

  stages {
    stages('Checkout') {
      steps {
        git branch: 'main', credentialsId: 'TaaviNat', url: 'https://github.com/TaaviNat/FarToCel.git'

      }
    }
  }
}
