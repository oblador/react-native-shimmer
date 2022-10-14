import React from 'react';
import { Image, StyleSheet, Text, View, Switch } from 'react-native';

import Shimmer from 'react-native-shimmer';
import logoSource from './react-logo.png';

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  title: {
    fontSize: 22,
    fontWeight: '300',
    marginBottom: 20,
  },
  switch: {
    marginBottom: 10,
    flexDirection: 'row',
    alignItems: 'center',
  },
  switchLabel: {
    fontSize: 16,
    marginLeft: 10,
  },
  loading: {
    marginVertical: 10,
  },
  loadingText: {
    textAlign: 'center',
    fontSize: 18,
    fontWeight: '500',
  },
  reactLogo: {
    width: 150,
    height: 150,
  },
});

export default function Example(props) {
  const [animating, setAnimating] = React.useState(true);

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Shimmer Example</Text>
      <View style={styles.switch}>
        <Switch value={animating} onValueChange={setAnimating} />
        <Text style={styles.switchLabel}>Animating</Text>
      </View>
      <View key={animating ? '1' : '0'}>
        <Shimmer style={styles.loading} duration={1000} animating={animating}>
          <Text style={styles.loadingText}>Loading...</Text>
        </Shimmer>
        <Shimmer direction="down" animating={animating}>
          <Image source={logoSource} style={styles.reactLogo} />
        </Shimmer>
      </View>
    </View>
  );
}
