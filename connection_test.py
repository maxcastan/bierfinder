import mysql.connector

cnx = mysql.connector.connect(user='teamdynamo', password='cop4710',
                              host='34.74.3.25',
                              database='beers')
cnx.close()