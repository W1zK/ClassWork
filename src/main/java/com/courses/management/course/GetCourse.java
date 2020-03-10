package com.courses.management.course;

import com.courses.management.common.Command;
import com.courses.management.common.View;

public class GetCourse implements Command {
    private View view;

    public GetCourse(View view) {
        this.view = view;
    }
    @Override
    public String command() {
        return "get_course";
    }

    @Override
    public void process() {


    }
}
