@Library('devops-mysql-database')_
def database = 'none'
def db_details = 'none'

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
          database = GetDatabase(repo_nombre)
        }
      }
    }
    stage('get database details') {
      steps{
        script{
          db_details = GetDatabaseDetails(database)
        }
      }
    }
    stage('run database scripts') {
      steps{
        script{
          RunDatabaseScripts(db_details)
        }
      }
    }
  }
}
