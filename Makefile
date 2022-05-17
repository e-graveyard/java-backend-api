.DEFAULT_GOAL := run


build:
	@docker build -t api .

run: build
	@docker run --rm --publish 8080:8080 api
