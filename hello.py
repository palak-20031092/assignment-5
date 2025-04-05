#!/usr/bin/env python3
import cgi

form = cgi.FieldStorage()
name = form.getvalue("name")
print("Content-type:text/html\r\n\r\n")
print(f"<html><body><h1>Hello, {name}!</h1></body></html>")
