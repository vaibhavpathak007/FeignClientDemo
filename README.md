# Feign Client Demo

Simple demo implementation of Feign Client with Fallback.

## Services

There are three services as follows:

```bash
1. math-service - Which has add, multiply and square as endpoint
2. consumer - Which uses feign client to call math-service API
2. Naming server - Every service registers itself to naming server
```

## How to run

Import these services in your IDE and run the application as java application

```python
Service      | Port

naming-server| 8761
math-service | 9091
consumer     | 9092
```

## API to hit

Make sure all services are up and running

```bash
Consumer service API : http://localhost:9092/perform-calculation
```