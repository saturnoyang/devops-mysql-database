@Library('devops-mysql-database')_

pipeline {
  agent any
  stages {
    stage('download source') {
      steps {        
        GetSourceCode(repo_clone_url,repo_nombre)          
      }
    }
    stage('determine database name') {
      steps {
        def database = GetDatabase(repo_nombre)
      }
    }
  }
}
