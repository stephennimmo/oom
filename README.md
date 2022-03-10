
```
mvn clean package
docker build -f Dockerfile -t quay.io/stephennimmo/oom .
```

```
docker run -i --rm quay.io/stephennimmo/oom
```

```
docker push quay.io/stephennimmo/oom
```