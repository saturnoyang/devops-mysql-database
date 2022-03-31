#!/usr/bin/env groovy
import groovy.yaml.YamlSlurper

def call(String repo_nombre = 'not_defined') {

	def repo_ruta = pwd() + File.separator + repo_nombre
	def database = repo_ruta + File.separator + "database.yaml"

    
    List example = new YamlSlurper().parseText(database)
    
    example.each{println it.database}

}