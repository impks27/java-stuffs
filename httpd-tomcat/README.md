# httpd-tomcat
Apache WebServer and Tomcat Admin Docs

# Lab-2: Install Apache From Source (As root user)
Prerequisites: 
1. c++ for compiling (installed)
2. PCRE v8.x 
3. APR and APR-UTILS
4. Apache Source
1. Download Apache Source from http://httpd.apache.org/download.cgi
```
#cd
# wget  http://mirrors.estointernet.in/apache//httpd/httpd-2.4.41.tar.gz
```

2. Download PCRE
```
#wget https://ftp.pcre.org/pub/pcre/pcre-8.42.tar.gz
```
3. Download Apache Portable Runtime and APR UTils
```
#wget http://mirrors.estointernet.in/apache//apr/apr-1.7.0.tar.gz

#wget http://mirrors.estointernet.in/apache//apr/apr-util-1.6.1.tar.gz
```

4. All the downloaded sources are in your home directory /home/training

5. extract Apache httpd source
```
# tar zxvf httpd-2.4.41.tar.gz 
```
This command will extract the source in httpd-2.4.41 directory

6. Extract APR and APR-Util inside httpd source folder
```
#tar zxvf apr-1.7.0.tar.gz –C httpd-2.4.41/srclib/

#tar zxvf apr-util-1.6.1.tar.gz –C httpd-2.4.41/srclib/
```
Rename apr and apr-util folders
```
#mv httpd-2.4.41/srclib/apr-1.7.0 httpd-2.4.41/srclib/apr
#mv httpd-2.4.41/srclib/apr-util-1.6.1/ httpd-2.4.41/srclib/apr-util
```
7. Extract PCRE and install it
```
#tar zxvf pcre-8.42.tar.gz 
#cd pcre-8.42
#./configure
#make
#make install
```
8. Compile Apache httpd
```
# cd httpd-2.4.41
#./configure --prefix=/usr/local/apache2

#make

#make install

#/usr/local/apache2/bin/apachectl start
```
9. Verify the server running status at http://localhost



