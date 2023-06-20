# API benchmark

## Quarkus
```shell
ab -n 1000 -c 100 http://localhost:8080/hello

------------------------
This is ApacheBench, Version 2.3 <$Revision: 1843412 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Completed 400 requests
Completed 500 requests
Completed 600 requests
Completed 700 requests
Completed 800 requests
Completed 900 requests
Completed 1000 requests
Finished 1000 requests


Server Software:        
Server Hostname:        localhost
Server Port:            8080

Document Path:          /hello
Document Length:        28 bytes

Concurrency Level:      100
Time taken for tests:   0.255 seconds
Complete requests:      1000
Failed requests:        0
Total transferred:      107000 bytes
HTML transferred:       28000 bytes
Requests per second:    3916.95 [#/sec] (mean)
Time per request:       25.530 [ms] (mean)
Time per request:       0.255 [ms] (mean, across all concurrent requests)
Transfer rate:          409.29 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    5   2.9      5      15
Processing:     1   19  18.3     10      90
Waiting:        1   17  17.9      8      90
Total:          5   25  18.0     17      94

Percentage of the requests served within a certain time (ms)
  50%     17
  66%     25
  75%     39
  80%     41
  90%     45
  95%     69
  98%     71
  99%     72
 100%     94 (longest request)
```

## Spring
```shell
ab -n 1000 -c 100 http://localhost:8081/hello

---------------------

This is ApacheBench, Version 2.3 <$Revision: 1843412 $>
Copyright 1996 Adam Twiss, Zeus Technology Ltd, http://www.zeustech.net/
Licensed to The Apache Software Foundation, http://www.apache.org/

Benchmarking localhost (be patient)
Completed 100 requests
Completed 200 requests
Completed 300 requests
Completed 400 requests
Completed 500 requests
Completed 600 requests
Completed 700 requests
Completed 800 requests
Completed 900 requests
Completed 1000 requests
Finished 1000 requests


Server Software:        
Server Hostname:        localhost
Server Port:            8081

Document Path:          /hello
Document Length:        40 bytes

Concurrency Level:      100
Time taken for tests:   0.648 seconds
Complete requests:      1000
Failed requests:        0
Total transferred:      173000 bytes
HTML transferred:       40000 bytes
Requests per second:    1543.59 [#/sec] (mean)
Time per request:       64.784 [ms] (mean)
Time per request:       0.648 [ms] (mean, across all concurrent requests)
Transfer rate:          260.78 [Kbytes/sec] received

Connection Times (ms)
              min  mean[+/-sd] median   max
Connect:        0    1   2.4      0      13
Processing:     7   51  19.7     48     131
Waiting:        6   49  19.0     47     130
Total:          7   52  20.0     49     132

Percentage of the requests served within a certain time (ms)
  50%     49
  66%     56
  75%     61
  80%     65
  90%     81
  95%     91
  98%    100
  99%    112
 100%    132 (longest request)
```