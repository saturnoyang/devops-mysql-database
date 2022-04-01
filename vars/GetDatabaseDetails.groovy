#!/usr/bin/env groovy

def call(String data_nombre = 'not_defined') {

	def repo_ruta = pwd() + File.separator + data_nombre
	def database = repo_ruta + File.separator "data"+ File.separator + "bbdd_info.yaml"

	echo "leer el archivo ${database}"
	def info = readYaml (file: "${database}")
      
    return info

}