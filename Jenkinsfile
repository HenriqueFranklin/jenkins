pipeline {
    agent any
    tools {
        maven 'Maven 3.8.1'  // Certifique-se de que o Maven está instalado no Jenkins
    }
    stages {
        stage('Build') {
            steps {
                git url: 'https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git'
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
