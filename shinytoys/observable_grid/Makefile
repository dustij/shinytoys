# Makefile for ObservableGrid
# Compiles Java source files and runs test driver

# Variables
JAVAC = javac
JAVA = java
SRC_DIR = .
TARGET_DIR = target
PACKAGE = observable_grid

# Source files
SOURCES = $(SRC_DIR)/ObservableGrid.java \
          $(SRC_DIR)/GridChangeEvent.java \
          $(SRC_DIR)/GridChangeListener.java \
          $(SRC_DIR)/TestDriver.java

# Class files (outputs)
CLASSES = $(TARGET_DIR)/$(PACKAGE)/ObservableGrid.class \
          $(TARGET_DIR)/$(PACKAGE)/GridChangeEvent.class \
          $(TARGET_DIR)/$(PACKAGE)/GridChangeListener.class \
          $(TARGET_DIR)/$(PACKAGE)/TestDriver.class

# Default target
.PHONY: all
all: compile

# Compile all Java source files
.PHONY: compile
compile: $(TARGET_DIR)
	@echo "Compiling Java source files..."
	$(JAVAC) -d $(TARGET_DIR) $(SOURCES)
	@echo "Compilation complete!"

# Run the test driver
.PHONY: run
run: compile
	@echo "Running TestDriver..."
	@echo ""
	$(JAVA) -cp $(TARGET_DIR) $(PACKAGE).TestDriver

# Create target directory if it doesn't exist
$(TARGET_DIR):
	@mkdir -p $(TARGET_DIR)

# Clean compiled files
.PHONY: clean
clean:
	@echo "Cleaning target directory..."
	rm -rf $(TARGET_DIR)
	@echo "Clean complete!"

# Display help information
.PHONY: help
help:
	@echo "ObservableGrid Makefile"
	@echo "======================"
	@echo ""
	@echo "Available targets:"
	@echo "  make          - Compile all Java source files (default)"
	@echo "  make compile  - Compile all Java source files"
	@echo "  make run      - Compile and run the test driver"
	@echo "  make clean    - Remove all compiled files"
	@echo "  make help     - Display this help message"
