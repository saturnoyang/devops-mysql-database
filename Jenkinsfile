@Library('devops-mysql-database')_

          def printParams() {
            env.getEnvironment().each { name, value -> println "Name: $name -> Value $value" }
            }
          printParams()

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
