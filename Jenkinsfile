@Library('devops-mysql-database')_

pipeline {
  agent any
  stages {
    stage('download source') {
      steps {
        holamundo 'ricardo parte -1'
      }
    }
    stage('Test') {
      steps {
        script {
          REPO_CLONE_URL = repo_clone_url
          echo "clonar repositorio: $REPO_CLONE_URL"
          echo './gradlew test'

        }
      }
    }
  }
}
