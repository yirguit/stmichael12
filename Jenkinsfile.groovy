pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'gradlew clean build'
            }
        }
    }
}