#!/usr/bin/env groovy

def call(String repo_url = 'not_defined',String repo_nombre = 'not_defined') {



  
  echo "Hello, ${repo_url}."
  File f = new File("${repo_nombre}");
  if(f.exists() && f.isDirectory()){
    echo "se debe eliminar el directorio"
    shortCommit = sh(returnStdout: true, script: "rm -fr $repo_nombre").trim()

  }
  echo f.absolutePath
  shortCommit = sh(returnStdout: true, script: "git clone $repo_url").trim()
  
  



}
