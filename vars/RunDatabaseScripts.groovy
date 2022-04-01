#!/usr/bin/env groovy
import static groovy.io.FileType.FILES


def call(java.util.LinkedHashMap db_details, String database, String repo_nombre ) {
	echo db_details."url"
	echo db_details."puerto"
	echo db_details."usuario"
	echo db_details."password"
	mysql = "mysql -h " +db_details."url" + " -P "+db_details."puerto"+" -u "+db_details."usuario"+" ${database} -e"

	echo mysql


	def repo_ruta = pwd() + File.separator + repo_nombre


	def dir = new File(repo_ruta);
	def files = [];
	dir.traverse(type: FILES, maxDepth: 0) { files.add(it) };
	
	files.each {
	  println it.path
	}

}