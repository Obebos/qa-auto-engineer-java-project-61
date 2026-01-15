.PHONY: all install setup build clean lint test run update start

# Основная цель по умолчанию
all: build

# Установка зависимостей и настройка проекта
setup:
	@echo "Setting up the project..."
	cd code/app && ./gradlew clean install

# Сборка проекта
build:
	@echo "Building project..."
	cd code/app && ./gradlew build

# Очистка проекта
clean:
	@echo "Cleaning project..."
	cd code/app && ./gradlew clean
	rm -rf build/
	rm -rf out/

# Проверка стиля кода (Checkstyle)
lint:
	@echo "Running checkstyle..."
	cd code/app && ./gradlew checkstyleMain checkstyleTest

# Запуск тестов
test:
	@echo "Running tests..."
	cd code/app && ./gradlew test

# Запуск приложения
run:
	@echo "Running application..."
	cd code/app && ./gradlew run

# Обновление зависимостей
update:
	@echo "Updating dependencies and plugins..."
	cd code/app && ./gradlew wrapper --gradle-version=8.13.0
	cd code/app && ./gradlew dependencies --update-locks
	@echo "Dependencies updated successfully"

# Старт (альтернативное название для setup)
start: setup

# Установка (альтернативное название для setup)
install: setup

# Проверка возможности обновления зависимостей
check-update:
	@echo "Checking for dependency updates..."
	cd code/app && ./gradlew dependencyUpdates

# Запуск с подробным выводом
run-verbose:
	@echo "Running application with verbose output..."
	cd code/app && ./gradlew run --info

# Запуск определенного теста
test-specific:
	@echo "Running specific tests..."
	cd code/app && ./gradlew test --tests "$(TEST)"

# Создание fat JAR (собранный со всеми зависимостями)
jar:
	@echo "Creating fat JAR..."
	cd code/app && ./gradlew shadowJar
#.PHONY: build
#build:
#    ./app/gradlew build

#.PHONY: run-dist
#run-dist:
 #   ./app/build/install/app/bin/app

#.PHONY: checkstyle
#checkstyle:
 #   ./app/gradlew checkstyleMain

#.PHONY: clean
#clean:
 #   ./app/gradlew clean