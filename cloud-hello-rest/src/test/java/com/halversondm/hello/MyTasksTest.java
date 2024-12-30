package com.halversondm.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTasksTest {

    @Test
    void printTime() {
        // Arrange
        MyTasks myTasks = new MyTasks();

        // Act
        myTasks.printTime();

        // Assert
        // No exceptions thrown
    }

}