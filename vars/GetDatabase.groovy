#!/usr/bin/env groovy
import org.yaml.snakeyaml.Yaml

def call(String repo_nombre = 'not_defined') {

	def repo_ruta = pwd() + File.separator + repo_nombre
	def database = repo_ruta + File.separator + "database.yaml"

    
    Yaml parser = new Yaml()
    List example = parser.load((database as File).text)
    
    example.each{println it.subject}

}