pipeline {
    agent any

    tools {
        maven 'Maven_3' // This must match the Maven name configured in Jenkins (we'll do that)
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/akshat201217/selenium_code.git', branch: 'master', credentialsId: '329f103c-785a-44c9-8861-ccbdbbbc0e73'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml' // Optional: If using JUnit reports
        }
    }
}
