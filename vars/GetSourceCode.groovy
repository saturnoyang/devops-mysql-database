#!/usr/bin/env groovy

def call(String repo_url = 'not_defined',String repo_nombre = 'not_defined') {


  def workspace = pwd()
  def repo_ruta = pwd() + File.separator + repo_nombre
  
  echo "Hello, ${repo_url}."
  
  File f = new File("${repo_ruta}");
  if(f.exists() && f.isDirectory()){
    echo "se debe eliminar el directorio"
    f.deleteDir()
  }
  echo "la ruta deberia ser ${repo_ruta}"


  shortCommit = sh(returnStdout: true, script: "git clone $repo_url").trim()
  
  



}
