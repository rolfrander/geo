# geo
Code for representing and converting between geographical coordinate systems, taken from
[Stack overflow](https://stackoverflow.com/questions/176137/java-convert-lat-lon-to-utm).

The code has been cleaned up a bit to make it more "object oriented" and according to common java
idioms and coding standards.

There are two classes, for [UTM-coordinates](https://en.wikipedia.org/wiki/Universal_Transverse_Mercator_coordinate_system)
and [WGS84-coordinates](https://en.wikipedia.org/wiki/World_Geodetic_System).
Example usage:

```
WGS84 wgs_a = new WGS84(56,-5);
UTM utm_a = new UTM(31, 'V', 375273.85, 6207884.59);
WGS84 wgs_b = new WGS84(utm_a);
UTM utm_b = new UTM(wgs_a);
```

# BUGS
There is no error-handling...
