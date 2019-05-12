pipeline {
    agent { docker { image 'gradle' } }
    stages {
        stage('build') {
            steps {
                sh './gradlew clean build'
            }
        }
    }
}