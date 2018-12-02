#!/bin/sh
echo "********************************************************"
echo "Wait for redis to be available"
echo "********************************************************"

while ! nc -z $REDIS_STATUS_HOST $REDIS_STATUS_PORT; do
  printf 'redis is still not available. Retrying...\n'
  sleep 3
done

echo "********************************************************"
echo "Starting myapp"
echo "********************************************************"

java -Dserver.port=$SERVER_PORT \
     -Dspring.redis.host=$REDIS_URL \
     -jar /opt/lib/springboot-redis-0.0.1-SNAPSHOT.jar