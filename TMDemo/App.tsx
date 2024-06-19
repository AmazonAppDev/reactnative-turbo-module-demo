import React from 'react';
import {useState} from 'react';
import {SafeAreaView, StatusBar, Text, Button} from 'react-native';
import RTNDeviceName from 'rtn-device/js/NativeGetDeviceName';

const App: () => JSX.Element = () => {
  const [result, setResult] = useState<string | null>(null);

  return (
    <SafeAreaView>
      <StatusBar barStyle={'dark-content'} />
      <Text style={{margin: 20}}>{result ?? 'Whats my device model?'}</Text>
      <Button
        title="Tell me!"
        onPress={async () => {
          const value = await RTNDeviceName?.getDeviceModel();
          setResult(value ?? null);
        }}
      />
    </SafeAreaView>
  );
};
export default App;
