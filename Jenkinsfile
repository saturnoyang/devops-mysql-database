@Library('devops-mysql-database')_

pipeline {
  agent any
  stages {
    stage('download source') {
      steps {
        holamundo 'ricardo parte 3'
      }
    }
    stage('Test') {
      steps {
        sh 'env'
        echo './gradlew test'

      }
    }
  }
}
