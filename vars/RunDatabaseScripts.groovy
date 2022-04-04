#!/usr/bin/env groovy
import groovy.io.FileType


def call(java.util.LinkedHashMap db_details, String database, String repo_nombre ) {
	echo db_details."url"
	echo db_details."puerto"
	echo db_details."usuario"
	echo db_details."password"

	mysql = "mysql -h " + db_details."url" + 
				" -P "+db_details."puerto"+
				" -u "+db_details."usuario"+
				" ${database} -e \"source " 

	
	def repo_ruta = pwd() + File.separator + repo_nombre


	@NonCPS
	new File(repo_ruta).traverse(type: FileType.FILES, nameFilter: ~/.*\.sql/) {
    	
    	cmd = mysql + it +"\""

    	echo cmd

    	sh cmd


	}


}