package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ReflectionDemo {
    public static int NumbofHumans(ArrayList<?> smth) {
        int numb = 0;
        for (Object o : smth) {
            if (o instanceof Human) {
                numb++;
            }
        }
        return numb;
    }

    public static ArrayList<String> PublicMethods(Object obj) {
        ArrayList<String> methods = new ArrayList<>();
        Method[] methods1 = obj.getClass().getMethods();
        for (Method method : methods1) {
            methods.add(method.getName());
        }
        return methods;
    }

    public static ArrayList<String> GetAllSuperClasses(Class<?> smth) {
        ArrayList<String> str = new ArrayList<>();
        while (smth != Object.class) {
            smth = smth.getSuperclass();
            str.add(smth.getSimpleName());
        }
        return str;
    }

    public static int GetAllExecutableObject(ArrayList<Object> smth) {
        int numb = 0;
        for (Object object : smth) {
            Class<?> classData = object.getClass();
            for (Class<?> cl : classData.getInterfaces()) {
                if (cl.getSimpleName().equals("Executable")) {
                    ((Executable) object).execute();
                    numb++;
                }
            }
        }
        return numb;
    }

    public static ArrayList<String> GetAllGettetsAndSetters(Object object) {
        ArrayList<String> str = new ArrayList<>();
        int mods = 0;
        for (Method method : object.getClass().getMethods()) {
            mods = method.getModifiers();
            if ((Modifier.isPublic(mods) && !Modifier.isStatic(mods) && method.getReturnType() != void.class && method.getParameterTypes().length == 0 && method.getName().startsWith("get")) ||
                    (Modifier.isPublic(mods) && !Modifier.isStatic(mods) && method.getReturnType() == void.class && method.getParameterTypes().length == 1 && method.getName().startsWith("set"))) {
                str.add(method.getName());
            }
        }
        return str;
    }
}