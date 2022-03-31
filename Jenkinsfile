@Library('devops-mysql-database')_

pipeline {
  agent any
  stages {
    stage('download source') {
      steps {
        holamundo 'ricardo parte -1'
        GetSourceCode(repo_clone_url)
        git url: repo_clone_url
        shortCommit = sh(returnStdout: true, script: "git clone $repo_clone_url").trim()
      }
    }
    stage('Test') {
      steps {
        script {
          REPO_CLONE_URL = repo_clone_url
          echo "clonar repositorio: $REPO_CLONE_URL"         

        }
      }
    }
  }
}
