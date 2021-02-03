<?php

// autoload_static.php @generated by Composer

namespace Composer\Autoload;

class ComposerStaticInit0c43cb9197543a3035f88c27c8ff8747
{
    public static $prefixLengthsPsr4 = array (
        'W' => 
        array (
            'Wead\\DigitalCep\\' => 16,
        ),
    );

    public static $prefixDirsPsr4 = array (
        'Wead\\DigitalCep\\' => 
        array (
            0 => __DIR__ . '/..' . '/wead/digital-cep/src',
        ),
    );

    public static $prefixesPsr0 = array (
        'S' => 
        array (
            'Search' => 
            array (
                0 => __DIR__ . '/..' . '/wead/digital-cep/src',
            ),
        ),
    );

    public static $classMap = array (
        'Composer\\InstalledVersions' => __DIR__ . '/..' . '/composer/InstalledVersions.php',
    );

    public static function getInitializer(ClassLoader $loader)
    {
        return \Closure::bind(function () use ($loader) {
            $loader->prefixLengthsPsr4 = ComposerStaticInit0c43cb9197543a3035f88c27c8ff8747::$prefixLengthsPsr4;
            $loader->prefixDirsPsr4 = ComposerStaticInit0c43cb9197543a3035f88c27c8ff8747::$prefixDirsPsr4;
            $loader->prefixesPsr0 = ComposerStaticInit0c43cb9197543a3035f88c27c8ff8747::$prefixesPsr0;
            $loader->classMap = ComposerStaticInit0c43cb9197543a3035f88c27c8ff8747::$classMap;

        }, null, ClassLoader::class);
    }
}