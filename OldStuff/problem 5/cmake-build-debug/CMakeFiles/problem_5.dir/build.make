# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "D:\jetbrains\clion\CLion 2020.2.4\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "D:\jetbrains\clion\CLion 2020.2.4\bin\cmake\win\bin\cmake.exe" -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "D:\jetbrains\c++ projects\CodeForces\problem 5"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "D:\jetbrains\c++ projects\CodeForces\problem 5\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/problem_5.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/problem_5.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/problem_5.dir/flags.make

CMakeFiles/problem_5.dir/main.cpp.obj: CMakeFiles/problem_5.dir/flags.make
CMakeFiles/problem_5.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="D:\jetbrains\c++ projects\CodeForces\problem 5\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/problem_5.dir/main.cpp.obj"
	D:\jetbrains\cpp\mingw64\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\problem_5.dir\main.cpp.obj -c "D:\jetbrains\c++ projects\CodeForces\problem 5\main.cpp"

CMakeFiles/problem_5.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/problem_5.dir/main.cpp.i"
	D:\jetbrains\cpp\mingw64\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "D:\jetbrains\c++ projects\CodeForces\problem 5\main.cpp" > CMakeFiles\problem_5.dir\main.cpp.i

CMakeFiles/problem_5.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/problem_5.dir/main.cpp.s"
	D:\jetbrains\cpp\mingw64\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "D:\jetbrains\c++ projects\CodeForces\problem 5\main.cpp" -o CMakeFiles\problem_5.dir\main.cpp.s

# Object files for target problem_5
problem_5_OBJECTS = \
"CMakeFiles/problem_5.dir/main.cpp.obj"

# External object files for target problem_5
problem_5_EXTERNAL_OBJECTS =

problem_5.exe: CMakeFiles/problem_5.dir/main.cpp.obj
problem_5.exe: CMakeFiles/problem_5.dir/build.make
problem_5.exe: CMakeFiles/problem_5.dir/linklibs.rsp
problem_5.exe: CMakeFiles/problem_5.dir/objects1.rsp
problem_5.exe: CMakeFiles/problem_5.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="D:\jetbrains\c++ projects\CodeForces\problem 5\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable problem_5.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\problem_5.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/problem_5.dir/build: problem_5.exe

.PHONY : CMakeFiles/problem_5.dir/build

CMakeFiles/problem_5.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\problem_5.dir\cmake_clean.cmake
.PHONY : CMakeFiles/problem_5.dir/clean

CMakeFiles/problem_5.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "D:\jetbrains\c++ projects\CodeForces\problem 5" "D:\jetbrains\c++ projects\CodeForces\problem 5" "D:\jetbrains\c++ projects\CodeForces\problem 5\cmake-build-debug" "D:\jetbrains\c++ projects\CodeForces\problem 5\cmake-build-debug" "D:\jetbrains\c++ projects\CodeForces\problem 5\cmake-build-debug\CMakeFiles\problem_5.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/problem_5.dir/depend

