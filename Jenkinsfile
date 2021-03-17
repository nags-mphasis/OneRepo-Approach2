pipeline {

    agent any

    stages {
        stage('build') {
            steps {
                sh './gradlew clean'
            }
        }
        stage('check1') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
        stage('Smoke Test') {
            steps {
                sh './gradlew clean test -Dcucumber.options="src/test/resources/SmokeTest/SmokeTest.feature"'
                cucumber buildStatus: 'UNSTABLE',
                reportTitle: 'Smoke Test',
                fileIncludePattern: '**/Smoke.json'
            }
        }
        stage('check2') {
            steps {
                input "Does the staging environment look ok?"
            }
        }
        stage('Sanity Test') {
            steps {
                sh './gradlew clean test -Dcucumber.options="src/test/resources/SanityTest/SanityTest.feature"'
                cucumber buildStatus: 'UNSTABLE',
                reportTitle: 'Sanity Test',
                fileIncludePattern: '**/Sanity.json'
            }
        }
        stage('check3') {
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
