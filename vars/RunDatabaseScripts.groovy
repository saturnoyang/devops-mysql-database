#!/usr/bin/env groovy

def call(java.util.LinkedHashMap db_details, String database ) {
	echo db_details."url"
	echo db_details."puerto"
	echo db_details."usuario"
	echo db_details."password"
	mysql = "mysql -h " +db_details."url" + " -P "+db_details."puerto"+" -u "+db_details."usuario"+" ${database}"

	echo mysql
}