pipeline {

    agent any

    stages {
        /* stage('build') {
            steps {
                sh './gradlew clean'
            }
        } */
        stage('Test') {
            steps {
                sh './gradlew clean test -Dcucumber.options="src/test/resources/SmokeTest/SmokeTest.feature"'
            }
        }
        stage('Test Reports') {
            steps {
                cucumber buildStatus: 'UNSTABLE',
                reportTitle: 'Smoke Test',
                fileIncludePattern: '**/*.json'
            }
        }
        stage('Sanity check') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
    }
    
    post {
        always {
            cleanWs()
        }
    }
}
