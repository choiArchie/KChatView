package com.ex.demo.model;

import com.ex.chat.enumeration.DisplayType;
import com.ex.chat.enumeration.ModuleType;

import java.util.List;

public class ChartCache {
    public List<ModuleType> enableModuleTypes;
    public DisplayType displayType = DisplayType.oneHour;
    public int beginPosition = 0;
    public float scale = 1;
}
