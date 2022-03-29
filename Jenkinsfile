@Library('devops-mysql-database')_

pipeline {
  agent any
  stages {
    stage('download source') {
      steps {
        holamundo 'ricardo parte 2'
      }
    }
    stage('Test') {
      steps {
        echo './gradlew test'
      }
    }
  }
}
