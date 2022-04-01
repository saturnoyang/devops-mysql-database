#!/usr/bin/env groovy

def call(String data_nombre = 'not_defined') {

	def repo_ruta = pwd() + File.separator +"data"+ File.separator + data_nombre+ File.separator + "bbdd_info.yaml"

	echo "leer el archivo ${repo_ruta}"
	def info = readYaml (file: "${repo_ruta}")
      
    return info

}