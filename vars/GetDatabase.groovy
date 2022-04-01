#!/usr/bin/env groovy

def call(String repo_nombre = 'not_defined') {

	def repo_ruta = pwd() + File.separator + repo_nombre
	def database = repo_ruta + File.separator + "database.yaml"

	def info = readYaml (file: "${database}")
      
    info.each{println it.database}

}