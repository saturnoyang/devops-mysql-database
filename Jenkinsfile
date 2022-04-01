@Library('devops-mysql-database')_
def database = 'none'

pipeline {
  agent any
  stages {
    stage('download source') {
      steps {        
        GetSourceCode(repo_clone_url,repo_nombre)          
      }
    }
    stage('determine database name') {
      steps{
        script{
          def database = GetDatabase(repo_nombre)
        }
      }
    }
    stage('get database details') {
      steps{
        script{
          def db_details = GetDatabaseDetails(database)
        }
      }
    }
  }
}
