#!/usr/bin/env groovy

def call(java.util.LinkedHashMap db_details ) {
	echo db_details."url"
	echo db_details."puerto"
	echo db_details."usuario"
	echo db_details."password"
}